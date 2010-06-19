
#include "Behavior.h"

namespace {
    ActivityRegistrar<Behavior>::Type temp("Behavior");
}

int Behavior::Execute() {
	/* null */
	return 0;
}

void Behavior::UserInit () {
	;
}

std::string Behavior::GetName () {
	return "Behavior";
}
	