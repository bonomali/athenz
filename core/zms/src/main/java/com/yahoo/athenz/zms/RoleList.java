//
// This file generated by rdl 1.4.8. Do not modify!
//

package com.yahoo.athenz.zms;
import java.util.List;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// RoleList - The representation for an enumeration of roles in the namespace,
// with pagination.
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class RoleList {
    public List<String> names;
    @RdlOptional
    public String next;

    public RoleList setNames(List<String> names) {
        this.names = names;
        return this;
    }
    public List<String> getNames() {
        return names;
    }
    public RoleList setNext(String next) {
        this.next = next;
        return this;
    }
    public String getNext() {
        return next;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != RoleList.class) {
                return false;
            }
            RoleList a = (RoleList) another;
            if (names == null ? a.names != null : !names.equals(a.names)) {
                return false;
            }
            if (next == null ? a.next != null : !next.equals(a.next)) {
                return false;
            }
        }
        return true;
    }
}