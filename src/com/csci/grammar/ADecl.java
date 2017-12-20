package com.csci.grammar; // Java Package generated by the BNF Converter.

import com.csci.visitor.Visitor;

public class ADecl extends Arg {

    public Type type_;
    public String id_;

    public ADecl(Type p1, String p2) {
        type_ = p1;
        id_ = p2;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
