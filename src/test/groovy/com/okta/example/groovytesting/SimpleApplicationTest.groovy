package com.okta.example.groovytesting

import org.testng.annotations.Test

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.allOf
import static org.hamcrest.Matchers.containsString
import static org.hamcrest.Matchers.greaterThan
import static org.hamcrest.Matchers.is
import static org.hamcrest.Matchers.emptyString
import static org.hamcrest.Matchers.lessThan

class SimpleApplicationTest {

    @Test
    void welcomeTest() {
        def app = new SimpleApplication()
        // welcome() is private
        assertThat app.welcome(), is("Hello")
    }

    @Test
    void addTest() {

        def app = new SimpleApplication()

        assertThat app.add(1, 2), is(3)

        // a bit contrived, but I want to show off a little more power with hamcrest Matchers
        assertThat app.add(2, 4), allOf(
                                            lessThan(7),
                                            greaterThan(5),
                                            is(6))

        // The error message are descriptive out of the box, forcing the test to fail, using `.add(4,4)` yields:
        /*
        Expected: (a value less than <7> and a value greater than <5> and is <6>)
             but: a value less than <7> <8> was greater than <7>
        */
    }

    @Test
    void concatTest() {

        def app = new SimpleApplication()

        assertThat app.concat(null, null), emptyString()
        assertThat app.concat(null, "bar"), is("bar")

        assertThat app.concat("foo", "bar"), is("foobar")

        // contrived, but used to illiterate another error message
        assertThat app.concat("foo", "bar"), allOf(
                                                        containsString("foo"),
                                                        containsString("bar"))

        // example error message if we replace "foo", "bar" with: "broken" "test"
        /*
        Expected: (a string containing "foo" and a string containing "bar")
             but: a string containing "foo" was "brokentest"
        */
    }
}