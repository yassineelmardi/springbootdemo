package com.howtodoinjava.demo.controller;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.royken.converter.EnglishNumberToWords;

@RestController
public class TestControleRest {

	@RequestMapping("/string/{value}")
	public String getString(@PathVariable String value) {
		String string = value;

		char[] chars = string.toCharArray();
		Arrays.sort(chars);
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (char c : chars) {
			charSet.add(c);
		}

		StringBuilder sb = new StringBuilder();
		for (Character character : charSet) {
			sb.append(character);
		}
		return sb.toString();

	}
	@RequestMapping("/number/{value}")
	public String getNumber(@PathVariable int value) {
		return EnglishNumberToWords.convert(value);

	}

}
