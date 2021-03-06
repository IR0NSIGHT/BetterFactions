package dovtech.betterfactions.faction.diplo.alliance.coalition;

import dovtech.betterfactions.faction.diplo.relations.FactionMessage;
import dovtech.betterfactions.faction.diplo.alliance.FactionWarParticipantInterface;
import dovtech.betterfactions.faction.diplo.alliance.assistance.FactionAssistance;
import org.schema.game.common.data.player.faction.Faction;

public class FactionCoalitionLeader implements FactionWarParticipantInterface, FactionCoalitionLeaderInterface {

    private Coalition coalition;
    private Faction leader;

    public FactionCoalitionLeader(Coalition coalition) {
        this.coalition = coalition;
        this.leader = this.coalition.getCoalitionLeader();
    }

    @Override
    public void requestAssistance(FactionAssistance[] assistance) {

    }

    @Override
    public void allianceMessage(FactionMessage message) {

    }

    @Override
    public void inviteToCoalition(Faction faction) {

    }
}
