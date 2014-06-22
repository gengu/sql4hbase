/**
	author : 亘古
	email : gengugu@foxmail.com
*/
grammar Sql4Hbase ;

statement : 
	  selectElement EOF 
; 


selectElement : 
	hq_select hq_from hq_where hq_limit
; 

hq_select 
	: 
	SELECT hq_columns 
;


hq_from : 
	FROM tableName
;

hq_where 
	: 
	WHERE hq_compare (AND hq_compare)*
;

hq_limit 
	: 
	LIMIT POSITIVE_INT 
;

hq_compare 
	: 
	ROWKEY compare STRING 
;

hq_columns 
	: 
	columnName (Dot columnName)*
	| ALL_COLUMNS
;

compare 
	: EQUAL
	| EQUAL_NS
	| NOTEQUAL
	| LESSTHANOREQUALTO
	| LESSTHAN
	| GREATERTHANOREQUALTO
	| GREATERTHAN
	| LIKE 
;
SELECT : [Ss][Ee][Ll][Ee][Cc][Tt] ;
AND : [Aa][Nn][Dd] ;
FROM : [Ff][Rr][Oo][Mm] ;
WHERE : [Ww][Hh][Ee][Rr][Ee];
LIMIT : [Ll][Ii][Mm][Ii][Tt];
LIKE : [Ll][Ii][Kk][Ee] ;

ALL_COLUMNS : '*' ; 
ROWKEY : [Rr][Oo][Ww][Kk][Ee][Yy];



columnName
	:
	TOCName
;

tableName 
	:
	TOCName
;

TOCName: 
	NameStartChar (Letter | HexDigit | Digit | HYPHEN | UNDERLINE)*
;

POSITIVE_INT : NOTZERO INT ;

INT : Digit+ ;
FLOAT : 
	Digit+ '.' Digit* 
	| '.' Digit+
;

fragment 
NameStartChar
	:
	[a-zA-Z]
;
fragment
Letter
    : 'a'..'z' | 'A'..'Z'
    ;

fragment
HexDigit
    : 'a'..'f' | 'A'..'F'
;
fragment
NOTZERO
	:
	'1'..'9'
;
fragment
Digit
    :
    '0'..'9'
;
Dot : ',';

EQUAL : '=' | '==';
EQUAL_NS : '<=>';
NOTEQUAL : '<>' | '!=';
LESSTHANOREQUALTO : '<=';
LESSTHAN : '<';
GREATERTHANOREQUALTO : '>=';
GREATERTHAN : '>';
UNDERLINE : '_' ;
HYPHEN : '-' ;
STRING 
	: 
	'"'(ESC|.)*?'"'
	|'\''(ESC|.)*?'\''
;
fragment 
ESC : '\\' [btnr"\\] ; 


