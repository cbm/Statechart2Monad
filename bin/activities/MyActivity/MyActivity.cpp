
#include "MyActivity.h"

namespace {
    ActivityRegistrar<MyActivity>::Type temp("MyActivity");
}

int MyActivity::Execute() {
	/* null */
	return 0;
}

void MyActivity::UserInit () {
	;
}

std::string MyActivity::GetName () {
	return "MyActivity";
}
	