package com.trustconnector.scdp.util.tlv.simpletlv;

import com.trustconnector.scdp.util.tlv.bertlv.*;
import com.trustconnector.scdp.util.*;
import com.trustconnector.scdp.util.tlv.*;

public class SimpleTLV extends TLV
{
    protected static final String SUB_PRE = "\n    -";
    
    protected SimpleTLV() {
    }
    
    public SimpleTLV(final int tag) {
        this.tag = new SimpleTag(tag);
        this.len = new BERLength(0);
    }
    
    public SimpleTLV(final int tag, final int value, final int valueLen) {
        this.tag = new SimpleTag(tag);
        this.len = new BERLength(valueLen);
        final byte[] vt = Util.intToBytes(value, valueLen);
        this.value = new ByteArray(vt);
    }
    
    public SimpleTLV(final int tag, final byte[] value) {
        this.tag = new SimpleTag(tag);
        if (value == null) {
            this.len = new BERLength(0);
        }
        else {
            this.len = new BERLength(value.length);
            this.value = new ByteArray(value);
        }
    }
    
    public SimpleTLV(final Tag tag, final Length len, final byte[] v) {
        super(tag, len, v);
    }
    
    public SimpleTLV(final Tag tag, final Length len, final byte[] v, final int vOff) {
        super(tag, len, v, vOff);
    }
    
    @Override
    public String toString() {
        return this.tag.toString() + this.len.toString() + this.value.toString();
    }
}
