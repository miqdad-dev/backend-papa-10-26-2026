
.PHONY: test run fmt
test:
	mvn -q test || true
run:
	@echo "Define run command for this project"
fmt:
	@echo "Add formatter (prettier/black/clang-format) if desired"
