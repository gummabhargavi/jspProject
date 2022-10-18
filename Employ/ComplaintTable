create database complaint_register;

use complaint_register;

Create Table Complaint
(
   ComplaintID varchar(30) primary key,
   ComplaintType varchar(30),
   CDescription varchar(100),
   ComplaintDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   Severity varchar(20),
   Status varchar(30) default 'Pending'
);

Create Table Resolve
(
   ComplaintID varchar(30),
   ComplaintDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   ResolveDate TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
   ResolvedBy varchar(30),
   Comments varchar(100)
);
