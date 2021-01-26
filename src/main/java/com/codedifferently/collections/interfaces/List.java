package com.codedifferently.collections.interfaces;

import javax.lang.model.element.Element;

public interface List {

    //crud implementation

    public void contains(Object o);
    public void add(Element e);
    public void remove(int o);
}
