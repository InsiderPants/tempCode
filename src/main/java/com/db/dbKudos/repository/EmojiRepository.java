package com.db.dbKudos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.db.dbKudos.model.Emoji;

public interface EmojiRepository extends JpaRepository<Emoji, Integer> {

}
