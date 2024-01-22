@org.hibernate.annotations.GenericGenerator(
  name = "ID_GENERATOR",
  type = org.hibernate.id.enhanced.SequenceStyleGenerator.class,
  parameters = {
     @org.hibernate.annotations.Parameter(
        name = "sequence_name",
        value = "JPWHSD_SEQUENCE"
     ),
     @org.hibernate.annotations.Parameter(
        name = "initial_value",
        value = "1000"
     )
})
package com.manning.javapersistence.ch05;
