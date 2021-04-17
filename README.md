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

Log in to your Okta Developer account (or [sign up](https://developer.okta.com/signup/) if you don’t have an account).

1. From the **Applications** page, choose **Add Application**.
2. On the Create New Application page, select **Web**.
3. Give your app a memorable name (e.g., `Testing is Groovy`), then click **Done**.

Copy your issuer (found under **Security** > **API** > **Authorization Servers**), client ID, and client secret into `src/main/resources/application.properties` as follows:

```properties
okta.oauth2.issuer=https://{yourOktaDomain}/oauth2/default
okta.oauth2.client-id={yourClientId}
okta.oauth2.client-secret={yourClientSecret}
```

**NOTE:** The value of `{yourOktaDomain}` should be something like `https://dev-123456.okta.com`. Make sure you don't include `-admin` in the value!

After modifying this file, start the app, and you should be able to authenticate with Okta.

```
./mvnw
```

## Links

This example uses the following open source libraries:

* [Apache Groovy](https://groovy-lang.org/)
* [Hamcrest](http://hamcrest.org/JavaHamcrest/)

## Help

Please post any questions as comments on the [Make Java tests Groovy again], or on the [Okta Developer Forums](https://devforum.okta.com/).

## License

Apache 2.0, see [LICENSE](LICENSE).

[Make Java tests Groovy again]: https://developer.okta.com/blog/2019/08/21/make-java-tests-groovy
