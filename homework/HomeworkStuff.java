package com.olympic.cis143.m06.student.homework;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


/**
 * This lab uses the java Stream API.
 */
public class HomeworkStuff {

    /**
     * This method will:
     * 1. sort the names
     * 2. convert the names to uppercase.
     * @param names The list of unsorted names in lowercase.
     * @return The sorted list in uppercase.
     */
    public List<String> orderNamesAndConvertToUppercase(final List<String> names) {
        List<String> upper =
        	names
        		.stream()
	        	.sorted()
	        	.map(String::toUpperCase)
	        	.collect(Collectors.toList());
        return upper;
    }

    /**
     * This adds all the integers in a list together.
     * @param integrers A list of integers
     * @return The total.
     */
    public Integer calculateAddListValues(final List<Integer> integrers) {
        return integrers
        			.stream()
        			.reduce(0, (num1, num2) -> num1 + num2);
    }

    /**
     * From the list, filter and find the oldest person.
     *
     * @param people A list of people.
     * @return The oldest person.
     */
    public Optional<Person> findTheOldestPerson(final List<Person> people) {
        return people
        		.stream()
        		.reduce((person1, person2) -> person1.getAge() > person2.getAge() ? person1 : person2);
    }

    /**
     * Filters out anyone under 21.
     * @param people A list of people.
     * @return Only people 21 or over.
     */
    public List<Person> findPeople21OrOver(final List<Person> people) {
        return people
        		.stream()
        		.filter(person -> person.getAge() >= 21)
        		.collect(Collectors.toList());
    }

    /**
     * Orders the people by age.
     * @param people A list of people to order by age.
     * @return The ordered list of people by age.
     */
    public List<Person> orderByAge(final List<Person> people){
        return people
        		.stream()
        		.sorted((person1, person2) -> person1.getAge().compareTo(person2.getAge()))
        		.collect(Collectors.toList());
    }
}
