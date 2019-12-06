package com.anz.advent;

import com.anz.advent.days.DayOne;
import com.anz.advent.days.DayThree;
import com.anz.advent.days.DayTwo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger LOGGER = LoggerFactory.getLogger("Results");

    public static void main(String[] args) {
	  var dayOne = new DayOne();
	  LOGGER.info("Day One, first answer = {}", dayOne.getAnswerOne());
	  LOGGER.info("Day One, second answer = {}", dayOne.getAnswerTwo());
	  var dayTwo = new DayTwo();
	  LOGGER.info("Day Two, first answer = {}", dayTwo.getAnswerOne());
	  LOGGER.info("Day Two, second answer = {}", dayTwo.getAnswerTwo());
	  var dayThree = new DayThree();
	  LOGGER.info("Day Three, first answer = {}", dayThree.getAnswerOne());
	  LOGGER.info("Day Three, second answer = {}", dayThree.getAnswerTwo());

    }
}
