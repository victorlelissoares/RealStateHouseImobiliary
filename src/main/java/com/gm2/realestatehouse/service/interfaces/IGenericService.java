package com.gm2.realestatehouse.service.interfaces;

import java.util.List;

public interface IGenericService {
    Long create (Object dto);
    List<?> list ();
    void delete();
    Long update();

}
