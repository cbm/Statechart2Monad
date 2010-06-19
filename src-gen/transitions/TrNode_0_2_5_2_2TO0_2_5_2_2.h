
#include "architecture/statechartEngine/ICondition.h"
			
class TrCond_0_2_5_2_2TO0_2_5_2_2 : public statechart_engine::ICondition {
			
public:

	void UserInit () { }

	bool Eval() {
		/* RobotControllerTimeout */
		return false;
    }
};
		
#include "architecture/statechartEngine/IAction.h"
			
class TrAction_0_2_5_2_2TO0_2_5_2_2 : public statechart_engine::IAction {
			
public:

	void UserInit () { }

	int Execute() {
		/* StartRobotControllerTimeout */
		return 0;
    }
};
		