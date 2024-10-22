create table if not exists data_leak_prevention_meta(
dlp_identifier varchar(255) not null,
source varchar(255) null,
data_breach varchar(255) null,
exfiltration varchar(255) null,
key_part char null,
data_loss_risk_identifier Integer null,
severe_risk_flag char null,
prevention_measure varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint data_leak_prevention_meta_pk primary key(dlp_identifier));