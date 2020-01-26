package com.moderncloudtech;
import static com.moderncloudtech.utils.StringUtils.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

// @formatter:off
// tag::user_guide[]
public interface TestDynamicTests {
	@TestFactory
	default Stream<DynamicTest> dynamicTestsForPalindromes() {
		return Stream.of("racecar", "radar", "mom", "dad","idiotoidi")
			.map(text -> dynamicTest(text, () -> assertTrue(isPalindrome(text))));
	}
}
