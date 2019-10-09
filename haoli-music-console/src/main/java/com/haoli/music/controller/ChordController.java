package com.haoli.music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.haoli.music.service.ChordService;

@RestController
public class ChordController {
	
	@Autowired
	private ChordService chordService;
	
	

}
