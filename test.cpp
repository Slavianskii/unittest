#include "pch.h"
#include "../StaticLib1/framework.h"

TEST(TestCaseName, TestName1) {
  EXPECT_EQ(isPrime(11), 1);
}
TEST(TestCaseName, TestName2) {
	EXPECT_EQ(isPrime(0), -1);
}
TEST(TestCaseName, TestName3) {
	EXPECT_EQ(isPrime(-11), -1);
}
TEST(TestCaseName, TestName4) {
	EXPECT_EQ(isPrime(987654323), 1);
}
TEST(TestCaseName, TestName5) {
	EXPECT_EQ(isPrime(20), 0);
}