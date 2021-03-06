package dovtech.betterfactions.contracts;

import dovtech.betterfactions.contracts.target.ContractTarget;
import dovtech.betterfactions.faction.BetterFaction;

public class Contract {

    private String name;
    private BetterFaction contractor;
    private ContractType contractType;
    private int reward;
    private ContractTarget target;

    public Contract(BetterFaction contractor, String name, ContractType contractType, int reward, ContractTarget target) {
        this.name = name;
        this.contractor = contractor;
        this.contractType = contractType;
        this.reward = reward;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public BetterFaction getContractor() {
        return contractor;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public int getReward() {
        return reward;
    }

    public ContractTarget getTarget() {
        return target;
    }

    public enum ContractType {
        ALL("All"),
        BOUNTY("Bounty"),
        CARGO_ESCORT("Cargo Escort"),
        MINING("Mining"),
        PRODUCTION("Production");

        public String displayName;

        ContractType(String displayName) {
            this.displayName = displayName;
        }
    }
}
