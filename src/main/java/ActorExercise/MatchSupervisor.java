package ActorExercise;

import akka.actor.typed.ActorRef;
import akka.actor.typed.Behavior;
import akka.actor.typed.javadsl.AbstractBehavior;
import akka.actor.typed.javadsl.ActorContext;
import akka.actor.typed.javadsl.Behaviors;
import akka.actor.typed.javadsl.Receive;
import ch.qos.logback.classic.Logger;


public  class MatchSupervisor extends AbstractBehavior<MatchSupervisor> {

private final ActorRef<Match> startMatch;
private String name;
    public MatchSupervisor(ActorContext<MatchSupervisor> context) {
        super(context);
        this.startMatch = getContext().spawn(Match.create(),"child");
    }

    public static Behavior<MatchSupervisor> create() {

        return Behaviors.setup(MatchSupervisor::new);
    }

    @Override
    public Receive<MatchSupervisor> createReceive() {

return null;
    }


//    public Behavior<MatchSupervisor> onStart(String name) {
//
//        ActorRef<Match> startMatch = getContext().spawn(Match.create(), name);
//        return this;
//    }
}



