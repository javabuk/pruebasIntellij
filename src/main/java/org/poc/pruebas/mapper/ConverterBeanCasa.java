package org.poc.pruebas.mapper;

import org.mapstruct.Mapper;

@Mapper
public interface ConverterBeanCasa {

    BeanHouse convertirCasaInHouse(BeanCasa beanCasa);

    BeanCasa convertirHouseInCasa(BeanHouse beanHouse);


}
