package com.wingjay.jianshi.db.model;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.wingjay.jianshi.db.JianshiDatabase;
import com.wingjay.jianshi.util.FullDateManager;

@Table(database = JianshiDatabase.class)
public class Diary extends BaseModel{
  @PrimaryKey
  String uuid;
  @Column
  String title;
  @Column
  String content;
  @Column(defaultValue = "0")
  long time_created;
  @Column(defaultValue = "0")
  long time_modified;
  @Column(defaultValue = "0")
  long time_removed;

  public String getUuid() {
    return uuid;
  }

  public void setUuid(String uuid) {
    this.uuid = uuid;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public long getTime_created() {
    return time_created;
  }

  public void setTime_created(long time_created) {
    this.time_created = time_created;
  }

  public long getTime_modified() {
    return time_modified;
  }

  public void setTime_modified(long time_modified) {
    this.time_modified = time_modified;
  }

  public long getTime_removed() {
    return time_removed;
  }

  public void setTime_removed(long time_removed) {
    this.time_removed = time_removed;
  }

  public String getChineseCreatedTime() {
    FullDateManager fullDateManager = new FullDateManager(time_created);
    return fullDateManager.getFullDate();
  }
}