package ActorExercise;

import akka.actor.typed.ActorRef;
import akka.actor.typed.ActorSystem;
import akka.actor.typed.javadsl.Behaviors;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final ActorSystem<MatchSupervisor> actorSystem = ActorSystem.create(MatchSupervisor.create(), "Guard");


    }






}
