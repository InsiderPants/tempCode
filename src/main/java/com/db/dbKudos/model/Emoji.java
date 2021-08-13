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
public class Emoji {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String name;
	
	@Column
	private String description;
	
	@Column
	private int cost;
	
	@Column
	private String emojiData;
}
