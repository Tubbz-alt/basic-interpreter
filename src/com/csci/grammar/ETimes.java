package com.csci.grammar; // Java Package generated by the BNF Converter.

import com.csci.visitor.Visitor;

public class ETimes extends Exp {

    public Exp exp_1, exp_2;

    public ETimes(Exp p1, Exp p2) {
        exp_1 = p1;
        exp_2 = p2;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
