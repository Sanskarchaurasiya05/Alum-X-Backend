# Alum-X Backend Database Schema

## Overview

This document provides a complete database diagram for the Alum-X Backend project, visualizing all entities, relationships, and table structures.

## Database Diagram

**DBDiagram.io Link:** [https://dbdiagram.io/d/db-diagram-6953811139fa3db27bcad4bf](https://dbdiagram.io/d/db-diagram-6953811139fa3db27bcad4bf)

## Schema Summary

| Category | Count |
|----------|-------|
| Main Entity Tables | 10 |
| Collection Tables | 13 |
| **Total Tables** | **23** |

## Entity Tables

### Core Entities

| Table | Primary Key | Description |
|-------|-------------|-------------|
| `users` | id | User accounts and profiles |
| `resume` | id | User resume storage (1:1 with users) |
| `job_posts` | post_id | Job/opportunity posts |
| `job_post_comments` | id | Comments on job posts |
| `job_post_likes` | id | Likes on job posts |
| `chats` | chat_id | Direct message conversations |
| `messages` | id | Chat messages |
| `group_chats` | group_id | Group conversations |
| `group_chat_participants` | id | Group members |
| `group_messages` | id | Group chat messages |

### User Collection Tables

| Table | Foreign Key | Description |
|-------|-------------|-------------|
| `user_skills` | user_id | User skills |
| `user_education` | user_id | Education history |
| `user_tech_stack` | user_id | Technologies known |
| `user_languages` | user_id | Programming languages |
| `user_frameworks` | user_id | Frameworks experience |
| `user_communication_skills` | user_id | Communication skills |
| `user_certifications` | user_id | Certifications |
| `user_projects` | user_id | Projects |
| `user_soft_skills` | user_id | Soft skills |
| `user_hobbies` | user_id | Hobbies |
| `user_experience` | user_id | Work experience |
| `user_internships` | user_id | Internships |
| `job_post_images` | post_id | Images attached to job posts |

## Relationships

### One-to-One (1:1)
- `users` - `resume` (Each user has one resume)

### One-to-Many (1:N)
- `users` -> `job_post_comments`
- `users` -> `job_post_likes`
- `users` -> All 12 user collection tables
- `job_posts` -> `job_post_images`
- `job_posts` -> `job_post_comments`
- `job_posts` -> `job_post_likes`
- `chats` -> `messages`
- `group_chats` -> `group_chat_participants`
- `group_chats` -> `group_messages`
