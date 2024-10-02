1. CI
    - name: Checkstyle
      run: mvn checkstyle:check

    - name: PMD
      run: mvn pmd:check

    - name: SpotBugs
      run: mvn spotbugs:check
   - https://docs.sqlfluff.com/en/stable/production/github_actions.html
  - https://docs.sonarsource.com/sonarqube/latest/devops-platform-integration/github-integration/adding-analysis-to-github-actions-workflow/ 
2. CD
    - Thêm đoạn code runner excute mysql
      - name: Deploy to procedure
        run: ssh user@your-server "mysql -user=your_account_mysql -password=your_account_pass < file_change.sql"
