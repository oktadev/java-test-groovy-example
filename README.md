# Testing Java with Groovy

This example demonstrates testing a Spring Boot application with Groovy and Hamcrest. Please read [Make Java tests Groovy with Hamcrest](https://developer.okta.com/blog/2019/08/21/make-java-tests-groovy).

**Prerequisites:** [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html/).

> [Okta](https://developer.okta.com/) has Authentication and User Management APIs that reduce development time with instant-on, scalable user infrastructure. Okta's intuitive API and expert support make it easy for developers to authenticate, manage, and secure users and roles in any application.

* [Getting Started](#getting-started)
* [Links](#links)
* [Help](#help)
* [License](#license)

## Getting Started

To install this example, run the following commands:

```bash
git clone https://github.com/oktadeveloper/java-test-groovy-example.git
cd java-test-groovy-example
```

### Create an Application in Okta

Before you begin, you’ll need a free Okta developer account. Install the [Okta CLI](https://cli.okta.com) and run `okta register` to sign up for a new account. If you already have an account, run `okta login`. Then, run `okta apps create`. Select the default app name, or change it as you see fit. Choose **Web** and press **Enter**.

Select **Okta Spring Boot Starter**. Accept the default Redirect URI values provided for you. That is, a Login Redirect of `http://localhost:8080/login/oauth2/code/okta` and a Logout Redirect of `http://localhost:8080`.

Make sure your Okta app’s values are in `src/main/resources/application.properties`.

```properties
okta.oauth2.issuer=https://{yourOktaDomain}/oauth2/default
okta.oauth2.client-id={yourClientId}
okta.oauth2.client-secret={yourClientSecret}
```

Simply run `./mvnw`, open a new incognito window and browse to `http://localhost:8080/`. You will be prompted to log in – use your new Okta credentials.

## Links

This example uses the following open source libraries:

* [Apache Groovy](https://groovy-lang.org/)
* [Hamcrest](http://hamcrest.org/JavaHamcrest/)

## Help

Please post any questions as comments on the [Make Java tests Groovy again], or on the [Okta Developer Forums](https://devforum.okta.com/).

## License

Apache 2.0, see [LICENSE](LICENSE).

[Make Java tests Groovy again]: https://developer.okta.com/blog/2019/08/21/make-java-tests-groovy
