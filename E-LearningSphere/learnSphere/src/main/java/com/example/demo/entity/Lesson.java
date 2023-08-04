package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Lesson {
	@Id
	int lessonId;
	String lessonName;
	String topic;
	String link;
	@ManyToOne
	Course coures;
	public Lesson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lesson(int lessonId, String lessonName, String topic, String link, Course coures) {
		super();
		this.lessonId = lessonId;
		this.lessonName = lessonName;
		this.topic = topic;
		this.link = link;
		this.coures = coures;
	}
	@Override
	public String toString() {
		return "Lesson [lessonId=" + lessonId + ", lessonName=" + lessonName + ", topic=" + topic + ", link=" + link
				+ ", coures=" + coures + "]";
	}
	public int getLessonId() {
		return lessonId;
	}
	public void setLessonId(int lessonId) {
		this.lessonId = lessonId;
	}
	public String getLessonName() {
		return lessonName;
	}
	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Course getCoures() {
		return coures;
	}
	public void setCoures(Course coures) {
		this.coures = coures;
	}
	
	
	
	
	
}
	