package com.niit.Techno.myrest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement()
public class Book
{
	private String id;
	private String name;
	private String authorname;
	private int volumenumber;
	private String publisher;
	@XmlElement(name="ID",required=true)
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	@XmlElement(name="NAME")
	public String getName()
	{
		return name;
	}
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	public int getVolumenumber() {
		return volumenumber;
	}
	public void setVolumenumber(int volumenumber) {
		this.volumenumber = volumenumber;
	}
	@XmlTransient
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	@XmlAttribute
	public String getAuthorName()
	{
		return authorname;
	}
     
}
