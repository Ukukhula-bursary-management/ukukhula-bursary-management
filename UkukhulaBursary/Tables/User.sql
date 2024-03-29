CREATE TABLE [dbo].[User]
(
  [ID] INT IDENTITY(1,1) PRIMARY KEY NOT NULL ,
  [FirstName] VARCHAR(50) NOT NULL,
  [LastName] VARCHAR(50) NOT NULL,
  [ContactID] INT NOT NULL,
  [UserRoleID] INT NOT NULL,
  [IsUserActive] BIT NOT NULL DEFAULT 1
)
GO

ALTER TABLE [dbo].[User]
ADD CONSTRAINT FK_UserRole FOREIGN KEY([UserRoleID]) REFERENCES [dbo].[UserRole]
GO

ALTER TABLE [dbo].[User]
ADD CONSTRAINT FK_Contact FOREIGN KEY([ContactID]) REFERENCES [dbo].[Contact]
GO