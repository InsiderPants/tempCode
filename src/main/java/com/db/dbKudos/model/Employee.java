package com.db.dbKudos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
	
	@Column
	private String name;
	
	@Id
	@Column
	private String email;
	
	@Column
	private int kudosPoints;
	
	@Column
	private String haveEmojis;
	
	@Column
	private String preferences;

}
