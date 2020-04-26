package com.y4kstudios.imp.testing.pyTestFixtures

import com.jetbrains.python.nameResolver.FQNamesProvider

class LambdaFixtureFQNames private constructor(private val myIsClass: Boolean, vararg names: String) : FQNamesProvider {
    private val myNames: Array<out String> = names

    override fun getNames(): Array<out String> {
        return myNames.clone()
    }

    override fun isClass(): Boolean {
        return myIsClass
    }

    companion object {
        val LAMBDA_FIXTURE = LambdaFixtureFQNames(false,
                "tests.util.fixtures.lambda_fixture",
                "pytest_lambda.fixtures.lambda_fixture")

        val STATIC_FIXTURE = LambdaFixtureFQNames(false,
                "tests.util.fixtures.static_fixture",
                "pytest_lambda.fixtures.static_fixture")

        val ERROR_FIXTURE = LambdaFixtureFQNames(false,
                "tests.util.fixtures.error_fixture",
                "pytest_lambda.fixtures.error_fixture")

        val DISABLED_FIXTURE = LambdaFixtureFQNames(false,
                "tests.util.fixtures.disabled_fixture",
                "pytest_lambda.fixtures.disabled_fixture")

        val NOT_IMPLEMENTED_FIXTURE = LambdaFixtureFQNames(false,
                "tests.util.fixtures.not_implemented_fixture",
                "pytest_lambda.fixtures.not_implemented_fixture")
    }

}
