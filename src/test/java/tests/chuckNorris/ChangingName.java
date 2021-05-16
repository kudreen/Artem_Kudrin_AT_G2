package tests.chuckNorris;

import org.testng.Assert;
import org.testng.annotations.Test;
import steps.chuckNorrisSteps.ChuckNorrisSteps;

public class ChangingName extends ChuckNorrisSteps {
   String firstName = "Aragorn";
   String lastName = "Son_of_Arathorn";
   String jokesNumber = "4";

   @Test
   public void changingNameForJoke() {
      Assert.assertTrue(changingNameForJoke(firstName, lastName) == true);
   }

   @Test
   public void fetchingRandomJoke(){
      Assert.assertTrue(fetchingRandomJokeStep() == true);
   }

   @Test
   public void fetchingMultipleRandomJokes(){
      Assert.assertTrue(fetchingMultipleRandomJokes(jokesNumber) == true);
   }
}
