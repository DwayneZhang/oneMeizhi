package com.example.dwayne.onemeizhi.data.entity;

import com.litesuits.orm.db.annotation.Column;
import com.litesuits.orm.db.annotation.PrimaryKey;

import java.io.Serializable;

/**
 * Created by Dwayne on 2017/11/25.
 */

public class Soul implements Serializable {
    @PrimaryKey(PrimaryKey.AssignType.AUTO_INCREMENT) @Column("_id") public long id;
}
