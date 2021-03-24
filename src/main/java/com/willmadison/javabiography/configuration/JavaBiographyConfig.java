package com.willmadison.javabiography.configuration;

import com.willmadison.javabiography.beans.Bulletpoint;
import com.willmadison.javabiography.beans.Java;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Collection;

@Configuration
public class JavaBiographyConfig {

    @Bean
    public Java java(Collection<Bulletpoint> bulletpoints) {
        return new Java(bulletpoints);
    }

    @Bean
    public Collection<Bulletpoint> bulletpoints() {
        return Arrays.asList(
                new Bulletpoint("Java was created in 1991 at Sun Microsystems by James Gosling."),
                new Bulletpoint("The initial motivation was to be able to write software once and run it anywhere."),
                new Bulletpoint("This was a huge deal at the time because software in those days had to be written specifically for each machine it was going to run on."),
                new Bulletpoint("Java has been one of the top three most popular languages in the world for 20 years (https://www.tiobe.com/tiobe-index/java/)"),
                new Bulletpoint("As of this morning there are more than 60,000 jobs looking for Java skills (https://www.indeed.com/jobs?q=java&l=United+States)"),
                new Bulletpoint("Some of the biggest companies in the world also use Java to power their systems:"),
                new Bulletpoint("For example, Netflix which pays its engineers nearly $500,000/year (https://www.levels.fyi/?compare=Netflix&track=Software%20Engineer)."),
                new Bulletpoint("Java is literally everywhere: Netflix => Java, Android Phones => Java, Cable Boxes => Java, Large Portions of Google => Java"),
                new Bulletpoint("Questions?")

        );
    }

}
