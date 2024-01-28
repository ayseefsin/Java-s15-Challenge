package com.aysin.libarary;

import java.util.*;

public interface Library {
    Books books= new Books(new LinkedList<>());
    Map<Reader, Books> readersBooks = new HashMap(){};

}