
#include "architecture/statechartEngine/ICondition.h"
			
class TrCond_0_2_4_2_1TO0_2_4_2_2 : public statechart_engine::ICondition {
			
public:

	void UserInit () { }

	bool Eval() {
		/* Behavior_timeout */
		return false;
    }
};
		
#include "architecture/statechartEngine/IAction.h"
			
class TrAction_0_2_4_2_1TO0_2_4_2_2 : public statechart_engine::IAction {
			
public:

	void UserInit () { }

	int Execute() {
		/* StartBehaviorTimeout */
		return 0;
    }
};
		