package composite.exercise;

public class HumanResource implements Component{
  @Override
  public void deploy() {
    System.out.println("Deploying a human resource");
  }
}
