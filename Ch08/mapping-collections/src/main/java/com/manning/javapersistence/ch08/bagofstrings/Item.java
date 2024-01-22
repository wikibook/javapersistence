/*
 * ========================================================================
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */
package com.manning.javapersistence.ch08.bagofstrings;

import com.manning.javapersistence.ch08.Constants;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@Entity
public class Item {

    @Id
    @GeneratedValue(generator = Constants.ID_GENERATOR)
    private Long id;

    private String name;

    @ElementCollection
    @CollectionTable(name = "IMAGE")
    @Column(name = "FILENAME")
    @org.hibernate.annotations.GenericGenerator(
            name = "sequence_gen",
            type = org.hibernate.id.enhanced.SequenceStyleGenerator.class
    )
    @org.hibernate.annotations.CollectionId(
            column = @Column(name = "IMAGE_ID"),
            generator = "sequence_gen"
            // 기존의 type 인자는 org.hibernate.annotations.CollectionIdJavaType 애너테이션을 사용하는 것으로 변경
    )
    @org.hibernate.annotations.CollectionIdJavaType(org.hibernate.type.descriptor.java.LongJavaType.class)
    private Collection<String> images = new ArrayList<>();

    public Item(String name) {
        this.name = name;
    }

    public Item() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<String> getImages() {
        return Collections.unmodifiableCollection(images);
    }

    public void addImage(String image) {
        images.add(image);
    }
}
