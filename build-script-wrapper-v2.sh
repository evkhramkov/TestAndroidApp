# bash wrapper script for custom build scripts
# example: sh build-script-wrapper.sh ./scripts/test.sh foo "foo1" bar "bar1"

script=$1

if [ $# -gt 1 ]; then
  for i in `seq 2 2 $#`
  do
    i1=$(expr $i + 1)
    name=${!i}
    value=${!i1}
    export $name="$value"
  done
fi

sh $script
