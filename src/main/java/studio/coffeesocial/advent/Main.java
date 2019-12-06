package studio.coffeesocial.advent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import studio.coffeesocial.advent.days.DayOne;
import studio.coffeesocial.advent.days.DayTwo;
import studio.coffeesocial.advent.days.DayThree;

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
