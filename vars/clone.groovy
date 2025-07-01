def call(String url, String branch) {
  echo "This step cloning the code."
  git url: "${url}", branch: "${branch}"
  echo "Code cloning successfully."
}
