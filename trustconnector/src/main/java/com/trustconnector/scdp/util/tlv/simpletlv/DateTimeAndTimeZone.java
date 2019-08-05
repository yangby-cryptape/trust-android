package com.trustconnector.scdp.util.tlv.simpletlv;

import com.trustconnector.scdp.util.tlv.*;
import com.trustconnector.scdp.util.tlv.bertlv.*;
import com.trustconnector.scdp.util.*;

public class DateTimeAndTimeZone extends SimpleTLV
{
    public DateTimeAndTimeZone(final Tag tag, final Length len, final byte[] v, final int vOff) {
        super(tag, len, v, vOff);
    }
    
    public DateTimeAndTimeZone() {
        this.tag = new SimpleTag(38);
        this.len = new BERLength(0);
    }
    
    public DateTimeAndTimeZone(final byte[] info) {
        this.tag = new SimpleTag(38);
        this.len = new BERLength(info.length);
        this.value = new ByteArray(info);
    }
    
    public DateTimeAndTimeZone(final String info) {
        this.tag = new SimpleTag(38);
        final byte[] infoV = ByteArray.convert(info);
        this.len = new BERLength(infoV.length);
        this.value = new ByteArray(infoV);
    }
}
