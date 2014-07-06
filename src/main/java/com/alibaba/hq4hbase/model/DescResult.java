package com.alibaba.hq4hbase.model;

import java.util.List;

/**
 * Created by genxiaogu on 14-7-3.
 * 查询表的基础信息
 */
public class DescResult {
    private List<Family> families ;

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    public static class Family{
        private String NAME ;
        private boolean BLOOMFILTER ;
        private int VERSIONS ;
        private long BLOCKSIZE ;
        private long TTL ;
        private boolean IN_MEMORY ;
        private boolean BLOCKCACHE ;

        public String getNAME() {
            return NAME;
        }

        public void setNAME(String NAME) {
            this.NAME = NAME;
        }

        public boolean isBLOOMFILTER() {
            return BLOOMFILTER;
        }

        public void setBLOOMFILTER(boolean BLOOMFILTER) {
            this.BLOOMFILTER = BLOOMFILTER;
        }

        public int getVERSIONS() {
            return VERSIONS;
        }

        public void setVERSIONS(int VERSIONS) {
            this.VERSIONS = VERSIONS;
        }

        public long getBLOCKSIZE() {
            return BLOCKSIZE;
        }

        public void setBLOCKSIZE(long BLOCKSIZE) {
            this.BLOCKSIZE = BLOCKSIZE;
        }

        public long getTTL() {
            return TTL;
        }

        public void setTTL(long TTL) {
            this.TTL = TTL;
        }

        public boolean isIN_MEMORY() {
            return IN_MEMORY;
        }

        public void setIN_MEMORY(boolean IN_MEMORY) {
            this.IN_MEMORY = IN_MEMORY;
        }

        public boolean isBLOCKCACHE() {
            return BLOCKCACHE;
        }

        public void setBLOCKCACHE(boolean BLOCKCACHE) {
            this.BLOCKCACHE = BLOCKCACHE;
        }
    }
}
