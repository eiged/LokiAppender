package ch.onestone.labor.loki;

import java.time.LocalTime;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LokiSample {

	public static void main(String[] args) {
		log.info("Current time : " + LocalTime.now());
		log.error("TEST ERROR {}", LokiSample.class.getSimpleName());

	}

}
