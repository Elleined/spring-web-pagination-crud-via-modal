# spring-web-pagination-crud-via-modal

# Before running this project 
  - Make sure you configure the application.properties for your database 
  - And see the db folder you can restore that db in your server to run this project
  - To restore a db here are the steps you can follow in MySQL Workbench
    - Administration | Data Import/Restore | tick the Import from self contain file then specify the full path to tbl_person.sql | Start Import
  - CLI 
     - mysql -u username -p database_name < locationOfDatabaseYouWantToImport/databaseYouWantToBackUp.sql
       Example : mysql -u root -p new_database < C:\Users\person_db.sql
     - if unknown db is thrown just create the database then rerun the above example
