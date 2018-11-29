#!/bin/bash

unset DB_DUMP TARBALL ACTION

while getopts 'srd:f:' c
do
	case $c in
		s) ACTION=SAVE ;;
		r) ACTION=RESTORE ;;
		d) DB_DUMP=$OPTARG ;;
		f) TARBALL=$OPTARG ;;
	esac
done

if [ -n "$DB_DUMP" ]; then
	case $ACTION in
		SAVE)		save_database $DB_DUMP		;;
		RESTORE) 	restore_database $DB_DUMP 	;;
	esac
fi

if [ -n "$TARBALL" ]; then
	case $ACTION in
		SAVE)		save_files $TARBALL		;;
		RESTORE)	restore_files $TARBALL	;;
	esac
fi


