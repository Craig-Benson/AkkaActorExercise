package ActorExercise;

import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;

public class Match extends AbstractBehavior<Match> {


    public Match(ActorContext<Match> context) {
        super(context);
    }

    public static Behavior<Match> create() {
        return Behaviors.setup(Match::new);
    }

    @Override

    public Receive<Match> createReceive() {
        return null;
    }
}