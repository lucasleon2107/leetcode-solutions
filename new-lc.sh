#!/bin/bash
# Usage: ./new-lc.sh 1 two-sum

NUMBER=$1
SLUG=$2

if [ -z "$NUMBER" ] || [ -z "$SLUG" ]; then
  echo "Usage: ./new-lc.sh <number> <slug>"
  exit 1
fi

PADDED=$(printf "%03d" "$NUMBER")
DIR="${PADDED}-${SLUG}"
FILE="${DIR}/solution.kt"
README="${DIR}/README.md"

mkdir -p "$DIR"

if [ ! -f "$FILE" ]; then
  cat <<EOF > "$FILE"
// LeetCode $NUMBER: $SLUG
// Paste your solution below

fun main() {
    // optional manual testing
}
EOF
fi

if [ ! -f "$README" ]; then
  cat <<EOF > "$README"
# $PADDED $SLUG

Problem link: https://leetcode.com/problems/$SLUG/
EOF
fi

echo "Created: $DIR"
echo "Now paste your solution into: $FILE"